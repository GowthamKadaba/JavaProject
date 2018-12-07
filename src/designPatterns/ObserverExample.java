package designPatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ObserverExample {

    public static void main(String[] args) {
        Bloomberg bloomberg = new Bloomberg();
        GS gs = new GS();
        bloomberg.add(gs);

        bloomberg.sendData("GOOG", 100);
        gs.display();
        bloomberg.sendData("GOOG", 101);
        bloomberg.sendData("AAPL", 500);
        gs.display();

        bloomberg.remove(gs);

        bloomberg.sendData("GOOG", 110);
        gs.display();
    }
}

interface MarketData{
    public void add(Broker broker);
    public void remove(Broker broker);
    public void sendData(String ticker, int value);
}

interface Broker{
    public void recieveData(String ticker, int value);
}

interface Terminal{
    public void display();
}

class Bloomberg implements MarketData{
    ArrayList<Broker> brokerList;

    public Bloomberg(){
        brokerList = new ArrayList<Broker>();
    }

    @Override
    public void add(Broker broker) {
        brokerList.add(broker);
    }

    @Override
    public void remove(Broker broker) {
        brokerList.remove(broker);
    }

    @Override
    public void sendData(String ticker, int value) {
        for(Broker broker :brokerList){
            broker.recieveData(ticker, value);
        }
    }
}

class GS implements Broker, Terminal{
    HashMap<String, Integer> hm;

    public GS(){
        hm = new HashMap<String, Integer>();
    }

    @Override
    public void recieveData(String ticker, int value) {
        hm.put(ticker, value);
    }

    @Override
    public void display() {
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Entry e = (Entry) itr.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
