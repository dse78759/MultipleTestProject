
Demo of synchronized objects being accessed by two different threads.

Cow is the provider, baby is the consumer, and fridge is the holder of milk.

If a baby wants milk , but there is none .....



TODO:

Baby will wait() if not enough milk, but no notify is called anywhere.... deadlocked?

How do I guarantee cows will produce enough milk for the babies?

Do a version with CompletableFuture

