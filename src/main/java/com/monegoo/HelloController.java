package com.monegoo;

import com.monegoo.db.CurrencyRepository;
import com.monegoo.db.entity.Currency;
import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import jakarta.inject.Inject;

import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;


@Controller("/")
public class HelloController {

    @Inject
    CurrencyRepository currencyRepository;

    @View("index")
    @Get("/")
    public HttpResponse<?> index() {

        Currency currency = currencyRepository.findTopByOrderByIdDesc();

        Locale locale = new Locale("en", "US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date instant = new Date();

        instant.setTime(currency.getTimestamp() * 1000);
        String date = dateFormat.format(instant);


        return HttpResponse.ok(CollectionUtils.mapOf(
                "now", date,
                "aed", currency.getAED()
        ));
    }
}
