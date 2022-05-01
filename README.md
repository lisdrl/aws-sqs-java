# Sample of AWS SQS Producer and Consumer using AWS SDK for Java

The main purpose of this activity was to decouple the producer and the consumer codes, as well as to turn the AWS Credentials, the owner ID and the queue name into environment variables.
The SQS queue should have been already created through AWS console or CLI.

## Running the code
- In order to run the project, you must configure four environment variables within .bash_profile to use in the following classes: CredentialsProvider (credentials package) and SQSGetQueueURL (services package). To open the bash_profile, run in the terminal:
```
code ~/.bash_profile
```
- Add the following environment variables in the bash_profile:
```
export AWS_ACCESS_KEY="YOUR_KEY"
export AWS_SECRET_KEY="YOUR_SECRET"
export AWS_QUEUE_NAME_SQS="QUEUE_NAME"
export AWS_OWNER_ID_SQS="OWNER_ID"
```

- Update the bash_profile:
```
source ~/.bash_profile
```
- Build the code:
```
./build.sh
```
- Finally, run the code:
```
./start.sh
```
## More about AWS SQS in Java
- [AWS official docs on SQS](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-sqs.html)
