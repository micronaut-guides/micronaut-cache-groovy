package example.micronaut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import java.time.Month

@Controller
class NewsController {

    private final NewsService newsService

    NewsController(NewsService newsService) {
        this.newsService = newsService
    }

    @Get('/{month}')
    News index(Month month) {
        new News(month: month, headlines: newsService.headlines(month))
    }
}
