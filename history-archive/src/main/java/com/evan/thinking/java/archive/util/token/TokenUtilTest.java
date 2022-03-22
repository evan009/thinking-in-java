package com.evan.thinking.java.archive.util.token;

public class TokenUtilTest {
	public static void main(String[] args){
		String tokenStr = TokenUtil.createToken('U', 35);
		System.out.println(tokenStr.toString());
		TokenUtil.Token token = TokenUtil.parseToken(tokenStr);
		System.out.println(token.toString());
	}
}
