# Practical 06: Remote Method Invocation (RMI)

# Aim

To create remote functions for addition, subtraction and multiplication and invoke these functions from a remote system using Java RMI.

# Technologies Used

- Java
- Java RMI
- Networking

# Concepts Covered

- Remote Method Invocation
- Remote interface
- UnicastRemoteObject
- RemoteException
- RMI Registry
- Client-server architecture
- Distributed computing

# Tools Required

- JDK
- VS Code / Eclipse
- Command Prompt or Terminal

# Files Included

- `CalculatorRemote.java` – Remote interface.
- `CalculatorRemoteImpl.java` – Implementation of remote methods.
- `RMIServer.java` – RMI server program.
- `RMIClient.java` – RMI client program.
- `output.png` – Server and client execution screenshots.

# Working Procedure

1. Create a remote interface extending Remote.
2. Declare addition, subtraction and multiplication methods.
3. Implement the remote interface.
4. Create an RMI server and register the remote object.
5. Connect the client to the RMI Registry.
6. Invoke the remote methods from the client.
7. Display the calculation results.

# Expected Outcome

The client successfully invokes mathematical operations from the remote server and displays the results.

# Learning Outcomes

- Understand distributed application development.
- Learn Java RMI architecture.
- Understand remote interfaces and remote objects.
- Implement remote method invocation.
