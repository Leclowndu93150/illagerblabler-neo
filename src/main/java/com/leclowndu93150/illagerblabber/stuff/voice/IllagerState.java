package com.leclowndu93150.illagerblabber.stuff.voice;

public abstract class IllagerState {
    private IllagerState() {}

    // Idle, just vibing
    public static final class Passive extends IllagerState {
        public static final Passive INSTANCE = new Passive();
        private Passive() {}
    }

    // Spotted the target
    public static final class Spotted extends IllagerState {
        public static final Spotted INSTANCE = new Spotted();
        private Spotted() {}
    }

    // In active combat
    public static final class Combat extends IllagerState {
        public static final Combat INSTANCE = new Combat();
        private Combat() {}
    }

    // Taking Damage
    public static final class Hurt extends IllagerState {
        public static final Hurt INSTANCE = new Hurt();
        private Hurt() {}
    }

    // Just killed their target
    public static final class Victory extends IllagerState {
        public static final Victory INSTANCE = new Victory();
        private Victory() {}
    }
}