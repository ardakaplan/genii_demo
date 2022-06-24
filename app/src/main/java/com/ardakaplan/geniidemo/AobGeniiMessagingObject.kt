package com.ardakaplan.geniidemo

import com.ardakaplan.geniidemo.aobobjects.Company
import com.ardakaplan.geniidemo.aobobjects.EnvironmentType
import com.google.gson.GsonBuilder
import java.io.Serializable


/**
 * Created by Arda Kaplan at 24.06.2022 - 15:05
 *
 * ardakaplan101@gmail.com
 */
class AobGeniiMessagingObject(
    val id: Int,
    val userId: String,
    val uuid: String,
    val company: Company,
    val environmentType: EnvironmentType,
    val type: Type,
    val trigger: Trigger
) : Serializable {


    enum class Type {
        HANDSHAKE,
        STAND_UP,  //ayağa kaldırma
        OPEN_WITHOUT_ORDER,  //siparişsiz açma
    }

    enum class Trigger {
        AOB, GENII
    }

    override fun toString(): String {

        val gson = GsonBuilder().setPrettyPrinting().create()

        return gson.toJson(this)
    }
}