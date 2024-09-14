public class Main {
    public static void main(String[] args) {
        //Empieza el juego
        Personaje miAvatar = new Guerrero();
        //Creo un anemigo
        Personaje enemigo = new Goblin();
        System.out.println(miAvatar.getDescripcion() + " tiene " + miAvatar.getPuntosDeVida() + " punto de vida");
        System.out.println("El enemigo tiene " + enemigo.getPuntosDeVida() + " punto de vida");

        //Consigo una armadura
        Personaje avatarConArmadura = new ArmaduraDeTitanio(miAvatar);

        System.out.println(avatarConArmadura.getDescripcion() + " tiene " + avatarConArmadura.getPuntosDeVida() + " punto de vida");

        //Consigo un escudo
        Personaje avatarConEscudo = new EscudoDeMadera(miAvatar);

        Personaje avatarConTodo = new ArmaduraDeTitanio(avatarConEscudo);

        System.out.println(avatarConEscudo.getDescripcion() + " tiene " + avatarConEscudo.getPuntosDeVida() + " puntos de vida");
        System.out.println(avatarConTodo.getDescripcion() + " tiene " + avatarConTodo.getPuntosDeVida() + " puntos de vida");

    }
}