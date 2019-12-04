package example.micronaut

import io.micronaut.core.annotation.Introspected

import java.time.Month

@Introspected
class News {
    Month month
    List<String> headlines
}
