# Pillager Patrol Fix

This plugin solves the problem when players go AFK and during that time multiple pillager patrols spawn around them.

The way it's done is by preventing pillager patrol spawn from happening if it is within 2*server view distance of a loaded pillager patrol captain.

This only affects pillager patrol spawn attempts and does not limit pillager spawns in raids or around pillager outposts.

Make sure you're using the latest SPIGOT for 1.14.4 because versions prior to September of 2019 do not have SpawnReason.PATROL.