package com.yeepay.message.iso8583.packager;

import org.jpos.iso.IFA_AMOUNT;
import org.jpos.iso.IFA_BINARY;
import org.jpos.iso.IFA_BITMAP;
import org.jpos.iso.IFA_LLCHAR;
import org.jpos.iso.IFA_LLLCHAR;
import org.jpos.iso.IFA_LLLNUM;
import org.jpos.iso.IFA_LLNUM;
import org.jpos.iso.IF_CHAR;
import org.jpos.iso.ISOBasePackager;
import org.jpos.iso.ISOFieldPackager;

/**
 * ISO 8583 v1987 BINARY Packager
 * @author alex
 */
public class ISO87BPackager extends ISOBasePackager {
	protected ISOFieldPackager[] fld = {
			new IFR_NUMERIC(4, "MESSAGE TYPE INDICATOR"),  // 0
			new IFA_BITMAP(16, "BIT MAP"), // 1
			new IFA_LLNUM(19, "PAN - PRIMARY ACCOUNT NUMBER"), // 2
			new IFR_NUMERIC(6, "PROCESSING CODE"), // 3
			new IFR_NUMERIC(12, "AMOUNT, TRANSACTION"), // 4
			new IFR_NUMERIC(12, "AMOUNT, SETTLEMENT"), // 5
			new IFR_NUMERIC(12, "AMOUNT, CARDHOLDER BILLING"),
			new IFR_NUMERIC(10, "TRANSMISSION DATE AND TIME"),
			new IFR_NUMERIC(8, "AMOUNT, CARDHOLDER BILLING FEE"),
			new IFR_NUMERIC(8, "CONVERSION RATE, SETTLEMENT"),   
			new IFR_NUMERIC(8, "CONVERSION RATE, CARDHOLDER BILLING"),  // 10
			new IFR_CHAR(6, "SYSTEM TRACE AUDIT NUMBER"), // 11
			new IFR_NUMERIC(6, "TIME, LOCAL TRANSACTION"), // 12
			new IFR_NUMERIC(4, "DATE, LOCAL TRANSACTION"), // 13
			new IFR_NUMERIC(4, "DATE, EXPIRATION"), // 14
			new IFR_NUMERIC(4, "DATE, SETTLEMENT"), // 15
			new IFR_NUMERIC(4, "DATE, CONVERSION"),
			new IFR_NUMERIC(4, "DATE, CAPTURE"),
			new IFR_NUMERIC(4, "MERCHANTS TYPE"),// 18
			new IFR_NUMERIC(3, "ACQUIRING INSTITUTION COUNTRY CODE"),  
			new IFR_NUMERIC(3, "PAN EXTENDED COUNTRY CODE"),   // 20
			new IFR_NUMERIC(3, "FORWARDING INSTITUTION COUNTRY CODE"),
			new IFR_NUMERIC(3, "POINT OF SERVICE ENTRY MODE"), // 22
			new IFR_NUMERIC(3, "CARD SEQUENCE NUMBER"), // 23
			new IFR_NUMERIC(3, "NETWORK INTERNATIONAL IDENTIFIEER"),
			new IFR_NUMERIC(2, "POINT OF SERVICE CONDITION CODE"), // 25
			new IFR_NUMERIC(2, "POINT OF SERVICE PIN CAPTURE CODE"),
			new IFR_NUMERIC(1, "AUTHORIZATION IDENTIFICATION RESP LEN"),
			
			new IFR_CHAR(9, "AMOUNT, TRANSACTION FEE"), // 28
			/*Amount*/
			new IFA_AMOUNT(9, "AMOUNT, SETTLEMENT FEE"),
			new IFA_AMOUNT(9, "AMOUNT, TRANSACTION PROCESSING FEE"),  // 30
			new IFA_AMOUNT(9, "AMOUNT, SETTLEMENT PROCESSING FEE"),
			new IFA_LLNUM(11, "ACQUIRING INSTITUTION IDENT CODE"), // 32
			new IFA_LLNUM(11, "FORWARDING INSTITUTION IDENT CODE"), // 33
			new IFA_LLCHAR(28, "PAN EXTENDED"),
			new IFA_LLNUM(37, "TRACK 2 DATA"), // 35
			new IFA_LLLNUM(104, "TRACK 3 DATA"), // 36
			new IFR_NUMERIC(12, "RETRIEVAL REFERENCE NUMBER"), // 37
			new IFR_CHAR(6, "AUTHORIZATION IDENTIFICATION RESPONSE"), // 38
			new IFR_CHAR(2, "RESPONSE CODE"), // 39
			new IFR_CHAR(3, "SERVICE RESTRICTION CODE"),   // 40
			new IFR_CHAR(8, "CARD ACCEPTOR TERMINAL IDENTIFICACION"), // 41
			new IFR_CHAR(15, "CARD ACCEPTOR IDENTIFICATION CODE"), // 42
			new IFR_CHAR(40, "CARD ACCEPTOR NAME/LOCATION"),
			new IFA_LLCHAR(25, "ADITIONAL RESPONSE DATA"), // 44
			new IFA_LLCHAR(76, "TRACK 1 DATA"), // 45
			new IFA_LLLCHAR(999, "ADITIONAL DATA - ISO"), // 46
			new IFA_LLLCHAR(999, "ADITIONAL DATA - NATIONAL"),
			new IFA_LLLCHAR(999, "ADITIONAL DATA - PRIVATE"), // 48
			new IFR_CHAR(3, "CURRENCY CODE, TRANSACTION"), // 49
			new IFR_CHAR(3, "CURRENCY CODE, SETTLEMENT"),  // 50
			new IFR_CHAR(3, "CURRENCY CODE, CARDHOLDER BILLING"),
			new IFA_BINARY(8, "PIN DATA"), // 52
			
			
			
			new IFR_NUMERIC(16, "SECURITY RELATED CONTROL INFORMATION"),
			new IFA_LLLCHAR(120, "ADDITIONAL AMOUNTS"), // 54
			new IFA_LLLCHAR(999, "RESERVED ISO"), // 55
			new IFA_LLLCHAR(999, "RESERVED ISO"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE"), // 60
			new IFA_LLLCHAR(999, "RESERVED PRIVATE"), // 61
			new IFA_LLLCHAR(999, "RESERVED PRIVATE"), // 62
			new IFA_LLLCHAR(999, "RESERVED PRIVATE"), // 63
			new IFA_BINARY(8, "MESSAGE AUTHENTICATION CODE FIELD"), // 64
			
			new IFA_BINARY(1, "BITMAP, EXTENDED"), // 65
			new IFR_NUMERIC(1, "SETTLEMENT CODE"),
			new IFR_NUMERIC(2, "EXTENDED PAYMENT CODE"),
			new IFR_NUMERIC(3, "RECEIVING INSTITUTION COUNTRY CODE"),
			new IFR_NUMERIC(3, "SETTLEMENT INSTITUTION COUNTRY CODE"),
			new IFR_NUMERIC(3, "NETWORK MANAGEMENT INFORMATION CODE"),// 70
			new IFR_NUMERIC(4, "MESSAGE NUMBER"),
			new IFR_NUMERIC(4, "MESSAGE NUMBER LAST"),
			new IFR_NUMERIC(6, "DATE ACTION"),
			new IFR_NUMERIC(10, "CREDITS NUMBER"),
			new IFR_NUMERIC(10, "CREDITS REVERSAL NUMBER"),
			new IFR_NUMERIC(10, "DEBITS NUMBER"),
			new IFR_NUMERIC(10, "DEBITS REVERSAL NUMBER"),
			new IFR_NUMERIC(10, "TRANSFER NUMBER"),
			new IFR_NUMERIC(10, "TRANSFER REVERSAL NUMBER"),
			new IFR_NUMERIC(10, "INQUIRIES NUMBER"), // 80
			new IFR_NUMERIC(10, "AUTHORIZATION NUMBER"),
			new IFR_NUMERIC(12, "CREDITS, PROCESSING FEE AMOUNT"),
			new IFR_NUMERIC(12, "CREDITS, TRANSACTION FEE AMOUNT"),
			new IFR_NUMERIC(12, "DEBITS, PROCESSING FEE AMOUNT"),
			new IFR_NUMERIC(12, "DEBITS, TRANSACTION FEE AMOUNT"),
			new IFR_NUMERIC(16, "CREDITS, AMOUNT"),
			new IFR_NUMERIC(16, "CREDITS, REVERSAL AMOUNT"),
			new IFR_NUMERIC(16, "DEBITS, AMOUNT"),
			new IFR_NUMERIC(16, "DEBITS, REVERSAL AMOUNT"),
			new IFR_NUMERIC(42, "ORIGINAL DATA ELEMENTS"), // 90
			new IF_CHAR(1, "FILE UPDATE CODE"),
			new IF_CHAR(2, "FILE SECURITY CODE"),
			new IF_CHAR(6, "RESPONSE INDICATOR"),
			new IF_CHAR(7, "SERVICE INDICATOR"),
			new IF_CHAR(42, "REPLACEMENT AMOUNTS"),
			new IFA_BINARY(16, "MESSAGE SECURITY CODE"),
			new IFA_AMOUNT(17, "AMOUNT, NET SETTLEMENT"),
			new IF_CHAR(25, "PAYEE"),
			new IFA_LLNUM(11, "SETTLEMENT INSTITUTION IDENT CODE"),
			new IFA_LLNUM(11, "RECEIVING INSTITUTION IDENT CODE"), // 100
			new IFA_LLCHAR(17, "FILE NAME"),
			new IFA_LLCHAR(28, "ACCOUNT IDENTIFICATION 1"),
			new IFA_LLCHAR(28, "ACCOUNT IDENTIFICATION 2"),
			new IFA_LLLCHAR(100, "TRANSACTION DESCRIPTION"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED ISO USE"), // 110
			new IFA_LLLCHAR(999, "RESERVED ISO USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED NATIONAL USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"), // 120
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_LLLCHAR(999, "RESERVED PRIVATE USE"),
			new IFA_BINARY(8, "MAC 2") // 128
			
		};

	/**
	 * 构造函数
	 */
	public ISO87BPackager() {
		setFieldPackager(buildFieldPackagers());
	}
	
	/**
	 * 构建字段定义数组
	 * 
	 * @return
	 */
	protected ISOFieldPackager[] buildFieldPackagers() {
		return fld;
	}
}
