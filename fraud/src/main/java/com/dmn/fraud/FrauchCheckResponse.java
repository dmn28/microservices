package com.dmn.fraud;

import org.springframework.web.bind.annotation.PostMapping;

public record FrauchCheckResponse(Boolean isFraudster) {
}
