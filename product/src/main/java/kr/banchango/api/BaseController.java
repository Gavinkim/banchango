package kr.banchango.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
public abstract class BaseController {

}
