package com.satna.ai.services;

import com.satna.exception.ProductException;
import com.satna.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
