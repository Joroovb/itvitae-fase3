import { useEffect, useState } from "react";
import CatRow from "./CatRow";

function CatTable() {
    const [cats, setCats] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const getCats = async () => {
            const res = await fetch("http://localhost:8082/api/kat/all");
            const data = await res.json();
            setCats(data);
            setLoading(false);
        }
        getCats();
    }, [])

    return (
        <>
            {loading && <p>Loading...</p>}

            <table>
                <thead>
                    <tr>
                        <th>Naam</th>
                        <th>Leeftijd</th>
                    </tr>
                </thead>
                <tbody>
                    {!loading && cats.map(cat => <CatRow key={cat.id} cat={cat} />)}
                </tbody>
            </table>
        </>
    )


}

export default CatTable;