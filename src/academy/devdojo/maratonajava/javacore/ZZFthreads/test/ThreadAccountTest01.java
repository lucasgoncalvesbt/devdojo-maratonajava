package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAcTest = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAcTest, "Thread 1");
        Thread t2 = new Thread(threadAcTest, "Thread 2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawn(10);
            if (account.getBalance() <= 0){
                System.out.println("Deu ruim");
            }
        }
    }

    private void withDrawn(int amount) {
        System.out.println(getThreadName() + " esta fora do sync ##########");
        synchronized (account) {
            System.out.println(getThreadName() + " esta dentro do sync **********");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + "está indo sacar dinheiro");
                account.withDrawn(amount);
                System.out.println(getThreadName() + "completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetur o saque, valor atual da conta: " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
