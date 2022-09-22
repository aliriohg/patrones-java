package com.ali;

import com.ali.behavioral.chainofresponsability.impl.Tarjeta;
import com.ali.behavioral.command.CreditCard;
import com.ali.behavioral.command.CreditCardActivateCommand;
import com.ali.behavioral.command.CreditCardDisableCommand;
import com.ali.behavioral.command.CreditCardInvoker;
import com.ali.behavioral.interpreter.AndExpression;
import com.ali.behavioral.interpreter.Expression;
import com.ali.behavioral.interpreter.OrExpression;
import com.ali.behavioral.interpreter.TerminalExpression;
import com.ali.behavioral.iterator.CardList;
import com.ali.behavioral.iterator.Iterator;
import com.ali.behavioral.iterator.List;
import com.ali.behavioral.mediator.ConcreteCollage1;
import com.ali.behavioral.mediator.ConcreteCollage2;
import com.ali.behavioral.mediator.ConcreteMediator;
import com.ali.behavioral.memento.Article;
import com.ali.behavioral.memento.Carataker;
import com.ali.behavioral.observer.Coche;
import com.ali.behavioral.observer.MessagePublisher;
import com.ali.behavioral.observer.Peaton;
import com.ali.behavioral.observer.Semaforo;
import com.ali.behavioral.state.MobileAlertStateContext;
import com.ali.behavioral.state.Silent;
import com.ali.behavioral.state.Vibration;
import com.ali.behavioral.strategy.CapitalStrategyTestFormatter;
import com.ali.behavioral.strategy.Context;
import com.ali.behavioral.strategy.LowerStrategyTestFormatter;
import com.ali.behavioral.templatemethod.Paypal;
import com.ali.behavioral.templatemethod.Visa;
import com.ali.behavioral.visitor.*;
import com.ali.creational.abstractFactory.example1.AbstractFactory;
import com.ali.creational.abstractFactory.example1.Card;
import com.ali.creational.abstractFactory.example1.FactoryProvider;
import com.ali.creational.abstractFactory.example1.PaymentMethod;
import com.ali.creational.factoryMethod.Payment;
import com.ali.creational.factoryMethod.PaymentFactory;
import com.ali.creational.factoryMethod.TypePayment;
import com.ali.creational.prototype.PrototypeCard;
import com.ali.creational.prototype.PrototypeFactory;
import com.ali.creational.singleton.CardSingleton;
import com.ali.structural.bridge.example1.ClassicCreditCard;
import com.ali.structural.bridge.example1.SecureCreditCard;
import com.ali.structural.bridge.example1.UnsecureCreditCard;
import com.ali.structural.composite.CuentaAhorro;
import com.ali.structural.composite.CuentaComponent;
import com.ali.structural.composite.CuentaComposite;
import com.ali.structural.composite.CuentaCorriente;
import com.ali.structural.facade.CreditMarket;
import com.ali.structural.flyweight.example1.Enemy;
import com.ali.structural.flyweight.example1.EnemyFactory;
import com.ali.structural.proxy.example1.Internet;
import com.ali.structural.proxy.example1.ProxyInternet;

import java.util.Random;

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
//        probarMemento();
//        probarObserver();
//        probarState();
//        probarInterpreter();
//        probarStrategy();
//        probarTemplateMethod();
//        probarVisitor();


//        Probar structural
//        probarAdapter();
//        probarBridge();
//        probarComposite();
//        probarDecorator();
//        probarFacade();
//        probarFlyweight();
        probarProxy();
    }

    private static void probarProxy() {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("udemy.com");
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void probarFlyweight() {
        for (int i = 0; i < 15; i++) {
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }

    }

    private static String getRandomEnemyType() {
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }

    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Fusil", "Pistola", "Revolver"};

    private static void probarFacade() {
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
        creditMarket.showCreditGold();
    }



    private static void probarComposite() {
        CuentaComponent cuentaCorriente = new CuentaCorriente("Alberto", 100.0);
        CuentaComponent cuentaAhorro = new CuentaAhorro("Alberto", 2000.0);

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaAhorro);
        cuentaComposite.addCuenta(cuentaCorriente);

        cuentaComposite.showAccountName();
        System.out.println(cuentaComposite.getAmount());

    }

    private static void probarBridge() {
        com.ali.structural.bridge.example1.CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();
        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
    }

    private static void probarAdapter() {
        com.ali.structural.adapter.CreditCard creditCard = new com.ali.structural.adapter.CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
    }

    private static void probarVisitor() {
        OfertaElement oferta = new OfertaGasolina();
        oferta.accept(new ClassicCreditCardVisitor());

        oferta = new OfertaVuelos();
        oferta.accept(new BlackCreditCardVisitor());
    }

    private static void probarTemplateMethod() {
        com.ali.behavioral.templatemethod.Payment visa = new Visa();
        visa.makePayment();
        com.ali.behavioral.templatemethod.Payment paypal = new Paypal();
        paypal.makePayment();

    }

    private static void probarStrategy() {
        Context context = new Context(new LowerStrategyTestFormatter());
        context.publishText("ESTE TEXTO SERA CONVERTIDO A MINUSCULA");
        Context context1 = new Context(new CapitalStrategyTestFormatter());
        context1.publishText("Este texto sera convertido en mayuscula");
    }

    private static void probarInterpreter() {
        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");

        Expression or = new OrExpression(cero, uno);
        Expression and = new AndExpression(cero, uno);

        System.out.println(or.interpret("0000340443223"));
        System.out.println(or.interpret("cero"));
        System.out.println(and.interpret("01"));

    }

    private static void probarState() {
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.setState(new Silent());
        context.alert();
    }

    private static void probarObserver() {
        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher publisher = new MessagePublisher();

        publisher.attach(coche);
        publisher.attach(peaton);
        publisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        publisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
    }

    private static void probarMemento() {
        Carataker carataker = new Carataker();
        Article article = new Article("alberto", "memento text 1");
        article.setTexto(article.getTexto() + " texto 2");
        System.out.println(article.getTexto());

        carataker.addMemento(article.createMemento());
        article.setTexto(article.getTexto() + " texto 3");
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

        while (iterator.hasNext()) {
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
