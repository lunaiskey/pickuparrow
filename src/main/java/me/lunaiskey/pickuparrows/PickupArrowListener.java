package me.lunaiskey.pickuparrows;

import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Trident;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class PickupArrowListener implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        Projectile projectile = e.getEntity();
        if (!(projectile instanceof AbstractArrow)) {
            return;
        }
        AbstractArrow arrow = (AbstractArrow) projectile;
        if (arrow instanceof Trident) {
            return;
        }
        arrow.setPickupStatus(AbstractArrow.PickupStatus.ALLOWED);
    }
}
