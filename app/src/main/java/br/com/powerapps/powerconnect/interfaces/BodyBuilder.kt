package br.com.powerapps.powerconnect.interfaces

import br.com.powerapps.powerconnect.model.Body


interface BodyBuilder {
    fun createBody(): Body
}