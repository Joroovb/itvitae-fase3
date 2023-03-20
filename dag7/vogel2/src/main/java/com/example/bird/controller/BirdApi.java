package com.example.bird.controller;

import com.example.bird.model.Bird;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "bird", description = "bird api")
@RequestMapping("/api/bird")
public interface BirdApi {

    @Operation(
            summary = "Creates a new bird entity",
            description = "Returns the newly created bird",
            tags = {"bird"}
    )
    @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = Bird.class)))
    @PostMapping(value = "/new", produces = {"application/json"})
    Bird newBird(@RequestBody Bird bird);

    @Operation(
            summary = "Gets all birds in the system",
            description = "Returns a list of birds containing zero or more entities",
            tags = {"bird"}
    )
    @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = Bird.class)))
    @GetMapping(value = "/all", produces = "application/json")
    Iterable<Bird> getAllBirds();

    @Operation(
            summary = "Get bird by id",
            description = "Gets the bird specified by id. If the bird is not found, returns 404.",
            tags = {"bird"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = Bird.class))),
            @ApiResponse(responseCode = "404", description = "Bird not found", content = @Content)
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    Bird getBirdById(
            @Parameter(
                    description = "ID of the bird",
                    required = true)
            @PathVariable(value = "id") Long id);
}
