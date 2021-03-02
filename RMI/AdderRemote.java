package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class AdderRemote extends UnicastRemoteObject implements Adder {


  /**
   *
   */
  private static final long serialVersionUID = 1L;

  AdderRemote() throws RemoteException {
    super();
  }

  public int add(int x, int y) throws RemoteException {
    return (x + y);
  }
}
