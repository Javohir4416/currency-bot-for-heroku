package javokhir.dev.currencytelegrambot.controller;

import javokhir.dev.currencytelegrambot.service.TelegramService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WebHookController {

    private final TelegramService telegramService;


    @PostMapping("/telegram")
    public void getUpdates(@RequestBody Update update){
        telegramService.getUpdates(update);
    }
}
