package com.jogadores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure().addAnnotatedClass(Jogador.class);
        SessionFactory factory = config.buildSessionFactory();

        try (Session session = factory.openSession()) {
            session.beginTransaction();

            Jogador jogador1 = new Jogador("Nome1", "Funcao1", "Time1", "Patente1");
            Jogador jogador2 = new Jogador("Nome2", "Funcao2", "Time2", "Patente2");
            Jogador jogador3 = new Jogador("Nome3", "Funcao3", "Time3", "Patente3");

            session.persist(jogador1);
            session.persist(jogador2);
            session.persist(jogador3);

            session.getTransaction().commit();
        }

        imprimirDadosJogador(factory, 1);
        imprimirDadosJogador(factory, 2);
        imprimirDadosJogador(factory, 3);

        factory.close();
    }

    private static void imprimirDadosJogador(SessionFactory factory, int jogadorId) {
        try (Session session = factory.openSession()) {
            Jogador jogador = session.get(Jogador.class, jogadorId);
            if (jogador != null) {
                System.out.println(jogador.getJogador());
            } else {
                System.out.println("Jogador não encontrado");
            }
        }
    }
}
