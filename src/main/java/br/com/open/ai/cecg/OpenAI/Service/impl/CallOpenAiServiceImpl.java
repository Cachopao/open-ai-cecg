package br.com.open.ai.cecg.OpenAI.Service.impl;

import br.com.open.ai.cecg.OpenAI.Service.CallOpenAiService;
import br.com.open.ai.cecg.OpenAI.component.ChatStreamComponent;
import br.com.open.ai.cecg.OpenAI.http.data.request.CantadasDoNegaoRequestDTO;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public record CallOpenAiServiceImpl(ChatStreamComponent streamComponent) implements CallOpenAiService {

    public static final String SCIENCE_FICTION_PROMPT_MESSAGE = "Gere uma estória de ficção cientifica de acordo com o " + "seguinte cenário: %s";

    @Override
    public String generateScienceFiction(ScienceFictionRequestDTO taleRequestDTO) {
        ChatCompletionRequest chatCompletionRequest =
                streamComponent.createChatStreamRequest(List.of(
                        new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(SCIENCE_FICTION_PROMPT_MESSAGE))
                ));
        return streamComponent.getChatStreamResult(chatCompletionRequest);

    }

    @Override
    public String generateCantadasDoNegao(CantadasDoNegaoRequestDTO requestDTO) {
        ChatCompletionRequest chatCompletionRequest = streamComponent.createChatStreamRequest(List.of(
                new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(SCIENCE_FICTION_PROMPT_MESSAGE))
        ));
        return streamComponent.getChatStreamResult(chatCompletionRequest);
    }
}
