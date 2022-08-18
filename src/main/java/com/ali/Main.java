package com.ali;

import com.ali.behavioral.chainofresponsability.impl.Tarjeta;
import com.ali.behavioral.command.CreditCard;
import com.ali.behavioral.command.CreditCardActivateCommand;
import com.ali.behavioral.command.CreditCardDisableCommand;
import com.ali.behavioral.command.CreditCardInvoker;
import com.ali.behavioral.iterator.CardList;
import com.ali.behavioral.iterator.Iterator;
import com.ali.behavioral.iterator.List;
import com.ali.behavioral.mediator.ConcreteCollage1;
import com.ali.behavioral.mediator.ConcreteCollage2;
import com.ali.behavioral.mediator.ConcreteMediator;
import com.ali.behavioral.memento.Article;
import com.ali.behavioral.memento.ArticleMemento;
import com.ali.behavioral.memento.Carataker;
import com.ali.creational.abstractFactory.AbstractFactory;
import com.ali.creational.abstractFactory.Card;
import com.ali.creational.abstractFactory.FactoryProvider;
import com.ali.creational.abstractFactory.PaymentMethod;
import com.ali.creational.factoryMethod.Payment;
import com.ali.creational.factoryMethod.PaymentFactory;
import com.ali.creational.factoryMethod.TypePayment;
import com.ali.creational.prototype.PrototypeCard;
import com.ali.creational.prototype.PrototypeFactory;
import com.ali.creational.singleton.CardSingleton;

import static com.ali.creational.prototype.PrototypeFactory.CartType.AMEX;
import static com.ali.creational.prototype.PrototypeFactory.CartType.VISA;

public class Main {

    public static void main(String[] args) {
//        Patrones Creacionales
//        probarFactoryMethod();
//        probarAbstractFactory();
//        probarCard();
//        probarPrototype();
//        probarSingleton();


//        Comportamiento
//        probarChainOfResponsability();
//        probarCommand();
//        probarIterator();
//    probarMediator();
        probarMemento();
    }

    private static void probarMemento() {
        Carataker carataker = new Carataker();
        Article article = new Article("alberto","memento text 1");
        article.setTexto(article.getTexto()+" texto 2");
        System.out.println(article.getTexto());

        carataker.addMemento(article.createMemento());
        article.setTexto(article.getTexto()+" texto 3");
        System.out.println(article.getTexto());

        carataker.addMemento(article.createMemento());
        article.restoreMemento(carataker.getMemento(0));
        System.out.println(article.getTexto());
    }

    private static void probarMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteCollage1 user1 = new ConcreteCollage1(mediator);
        ConcreteCollage2 user2 = new ConcreteCollage2(mediator);
        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy el user1");
    }

    private static void probarIterator() {
        com.ali.behavioral.iterator.Card[] cards = new com.ali.behavioral.iterator.Card[4];
        cards[0] = new com.ali.behavioral.iterator.Card("visa");
        cards[1] = new com.ali.behavioral.iterator.Card("AMEX");
        cards[2] = new com.ali.behavioral.iterator.Card("MASTER CARD");
        cards[3] = new com.ali.behavioral.iterator.Card("GOOGLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()){
            com.ali.behavioral.iterator.Card tarjeta = (com.ali.behavioral.iterator.Card) iterator.next();
            System.out.println(tarjeta.getType());
        }
    }

    private static void probarCommand() {
        CreditCard creditCard = new CreditCard();
        CreditCardInvoker invoker = new CreditCardInvoker();
//        activar tarjeta
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("-----------------");
//        desactivar tarjeta
        invoker.setCommand(new CreditCardDisableCommand(creditCard));
        invoker.run();
    }

    private static void probarChainOfResponsability() {
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.creditCardRequest(60000);
    }

    private static void probarSingleton() {
        CardSingleton card = CardSingleton.getINSTANCE();
        card.setCardNumber("0000000-111111");
        System.out.println("Card number is " + card.getCardNumber());
        System.out.println("Card number is " + CardSingleton.getINSTANCE().getCardNumber());

    }

    private static void probarPrototype() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void probarFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }

    private static void probarAbstractFactory() {
        AbstractFactory cardAbstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) cardAbstractFactory.create("VISA");
        AbstractFactory patmentAbstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) patmentAbstractFactory1.create("DEBIT");
        System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() + " con el metodo de pago: " + paymentMethod.doPayment());
    }

    private static void probarCard() {
        com.ali.creational.builder.Card card = com.ali.creational.builder.Card.builder().cardType("VISA")
                .number("0000 1111 2222 3333").name("Alirio Hernandez").expires(900).credit(true).build();
        System.out.println(card.toString());

    }
}
