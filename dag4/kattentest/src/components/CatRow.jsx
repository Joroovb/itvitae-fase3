function CatRow(props) {

    const {naam, leeftijd} = props.cat;

    return (
        <tr>
        <td>{naam}</td>
        <td>{leeftijd}</td>
        </tr>
    )

}

export default CatRow;