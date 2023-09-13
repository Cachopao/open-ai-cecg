package br.com.open.ai.cecg.OpenAI.http;

import br.com.open.ai.cecg.OpenAI.http.data.request.CantadasDoNegaoRequestDTO;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface OpenAiController {
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    String generateScienceFiction(@RequestBody ScienceFictionRequestDTO requestDTO);

    @PostMapping(value = "/cantadas-do-negao")
    @ResponseStatus(HttpStatus.OK)
    String generateCantadasDoNegao(@RequestBody CantadasDoNegaoRequestDTO requestDTO);
}
