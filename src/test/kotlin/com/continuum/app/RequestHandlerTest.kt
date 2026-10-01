package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handlesHealthCheck() {
        val handler = RequestHandler(ProcessingService("continuum-request-for-payment-outbound"))

        assertEquals("continuum-request-for-payment-outbound processed: health-check", handler.handle("health-check"))
    }
}