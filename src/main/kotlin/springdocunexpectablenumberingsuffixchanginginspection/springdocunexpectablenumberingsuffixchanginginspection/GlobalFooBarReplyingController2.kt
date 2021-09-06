package springdocunexpectablenumberingsuffixchanginginspection.springdocunexpectablenumberingsuffixchanginginspection

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/foobar2")
@RestController
class GlobalFooBarReplyingController2 {

    @GetMapping(path = ["/foobar"], produces = [MediaType.TEXT_PLAIN_VALUE])
    fun foobar(): String {
        return "foobar2"
    }
}
