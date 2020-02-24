package com.company.pckg_myMessanger.pckg_myNetwork;

import sun.rmi.transport.tcp.TCPConnection;
//события, которые могут возникать с соединением. Нужно для того, чтобы по-разному реагировать на события
public interface INetwork {

    //когда мы запустили соединение и оно готово для работы
    void onConnectionReady(MyNetwork tcpConnection);
    //когда соединение приняло входящее значение
    void onReceiveString (MyNetwork tcpConnection, String value);
    //когда соединение было прервано
    void onDisconnect (MyNetwork tcpConnection);
    //когда что-то пошло не так
    void onException (MyNetwork tcpConnection, Exception e);
}
