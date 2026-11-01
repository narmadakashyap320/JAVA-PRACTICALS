
## Practical 04: Client-Server Communication using TCP

# Aim

To develop a Java program for client-server communication using the TCP protocol with ServerSocket and Socket classes.

# Technologies Used

- Java
- TCP/IP Networking

# Concepts Covered

- Client-server architecture
- Socket programming
- TCP protocol
- ServerSocket class
- Socket class
- InputStream
- OutputStream
- Network communication

# Tools Required

- JDK
- VS Code / Eclipse
- Command Prompt or Terminal
- Two terminal windows

# Files Included

- "TCPServer.java" – Server-side program.
- "TCPClient.java" – Client-side program.
- "output.png" – Client and server execution screenshots.

# Working Procedure

1. Create a ServerSocket on port 5000.
2. Start the server and wait for a client connection.
3. Create a Socket in the client program.
4. Establish communication between client and server.
5. Send a message from the client.
6. Receive and display the message on the server.
7. Send a response back to the client.

# Execution

First, run the server:

``` bash
javac TCPServer.java
java TCPServer
```
Then open another terminal and run the client:

``` bash
javac TCPClient.java
java TCPClient
```

# Expected Outcome

The client successfully sends a message to the server, and the server receives and responds to the message.

# Learning Outcomes

- Understand client-server architecture.
- Learn TCP socket programming.
- Understand the working of Socket and ServerSocket classes.
- Develop basic network communication applications.
