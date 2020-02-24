package com.company.pckg_threads;

import java.util.concurrent.Phaser;
class main {

    public static void main(String[] args) {
       Phaser phaser=new Phaser(2);
        //создаем 2 сотрудника, которые будут мыть авто...
       new washer(phaser);
       new washer(phaser);
    }

    static class washer extends Thread {
        Phaser phaser;
        public washer (Phaser phaser){
            //вариант регистрации
            //phaser.register();
            this.phaser=phaser;
            start();
        }
        @Override
        public void run() {
            for (int i=0;i<3;i++)//у нас будет 3 машины
            {
                System.out.println("Поток " + getName() + ". Мою машину");
                phaser.arriveAndAwaitAdvance();
            }
            }
        }
    }


