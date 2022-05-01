package br.com.sqs_producer.services;

import br.com.sqs_producer.credentials.CredentialsProvider;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

public class SQSSendMessage {
    public static void sendMessage(String message) {
        SqsClient sqsClient = SQSClient.returnSQSClient(CredentialsProvider.returnCredentials());

        String queueUrl = SQSGetQueueURL.returnQueueUrl(sqsClient);
        // System.out.println("url:", queueUrl);

        sendMessage(sqsClient, "http://sqs.us-east-1.amazonaws.com/304406437156/test1", message);
        sqsClient.close();
    };

    public static void sendMessage(SqsClient sqsClient, String queueUrl, String message) {
        SendMessageRequest sendMsgRequest = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                // .messageGroupId("grupo") // Para filas fifo
                .messageBody(message)
                .build();
        sqsClient.sendMessage(sendMsgRequest);
    };
};