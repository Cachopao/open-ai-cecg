package br.com.open.ai.cecg.OpenAI.http.impl;

import br.com.open.ai.cecg.OpenAI.http.OpenAiController;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/opneai-cecg")
@RestController
public class OpenAiControllerImpl implements OpenAiController {
    @Override
    @PostMapping(value = "/science-fiction")
    @ResponseStatus(HttpStatus.OK)
    public String generateScienceFiction(ScienceFictionRequestDTO requestDTO) {
        return null;
    }
}
