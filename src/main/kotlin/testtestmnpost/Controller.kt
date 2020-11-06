package testtestmnpost

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces

@Controller("/test")
class Controller {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Its working"
    }

    @Post
    @Produces(MediaType.TEXT_PLAIN)
    fun dopost(): String{
        return "ok"
    }
}