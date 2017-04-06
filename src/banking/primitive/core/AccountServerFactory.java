/*
  File:		AccountServerFactory.java
  Author:	Kevin Gary
  Date:		April 6 2017
  
  Description: Factory for the AccountServer
*/

package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
