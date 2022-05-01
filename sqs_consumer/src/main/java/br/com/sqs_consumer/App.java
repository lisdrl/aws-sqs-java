package br.com.sqs_consumer;

import br.com.sqs_consumer.services.SQSMessageReader;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println("Lendo mensagens ...");
        while(true){
            SQSMessageReader.messageReader();
            // Thread.sleep(1000); // Desabilitado por causa do Long Polling para econmizar $$
        }
    };
};