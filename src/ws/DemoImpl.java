package ws;

import javax.jws.*;


@WebService(endpointInterface="ws.Demo")
public class DemoImpl implements Demo{

	@Override
	public String helloworld() {
		return "hello there";
	}

	@Override
	public String hi(String fullname) {
		// TODO Auto-generated method stub
		return "htlo" + fullname;
	}

}
