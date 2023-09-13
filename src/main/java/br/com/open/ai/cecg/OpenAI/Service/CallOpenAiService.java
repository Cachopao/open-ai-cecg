package br.com.open.ai.cecg.OpenAI.Service;

import br.com.open.ai.cecg.OpenAI.http.data.request.CantadasDoNegaoRequestDTO;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;

public interface CallOpenAiService {
    String generateScienceFiction (ScienceFictionRequestDTO taleRequestDTO);

    String generateCantadasDoNegao(CantadasDoNegaoRequestDTO requestDTO);
}
