kafka-topics --bootstrap-server kafka1:19092 --create --topic test-topic --partitions 1 \
      --replication-factor 1 --config max.message.bytes=64000 --config flush.messages=5