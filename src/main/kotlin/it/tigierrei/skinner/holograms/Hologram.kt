package it.tigierrei.skinner.holograms

import org.bukkit.Location
import org.bukkit.entity.ArmorStand
import org.bukkit.entity.EntityType

class Hologram(val name: String, val location: Location){

    val entity: ArmorStand = location.world?.spawnEntity(location, EntityType.ARMOR_STAND)!! as ArmorStand

    init {
        entity.isVisible = false
        entity.setGravity(false)
        entity.setBasePlate(false)
        entity.isCustomNameVisible = true
        entity.customName = name
    }
}