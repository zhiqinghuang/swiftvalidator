package net.uglobal.swiftvalidator.xml.beans;

import java.util.HashMap;
import java.util.Map;

public enum MTType {
	// *************************** IMPORTANT ***********************************
	// DO NOT REMOVE any lines below.  They are auto generated by code generator
	// *************************************************************************
	//
	//
	// %%%%%BEGIN%%%%%
    //
    MT200("200", net.uglobal.swiftvalidator.xml.beans.MT200.class), //
    MT201("201", net.uglobal.swiftvalidator.xml.beans.MT201.class), //
    MT202("202", net.uglobal.swiftvalidator.xml.beans.MT202.class), //
    MT202COV("202COV", net.uglobal.swiftvalidator.xml.beans.MT202COV.class), //
    MT203("203", net.uglobal.swiftvalidator.xml.beans.MT203.class), //
    MT204("204", net.uglobal.swiftvalidator.xml.beans.MT204.class), //
    MT205("205", net.uglobal.swiftvalidator.xml.beans.MT205.class), //
    MT205COV("205COV", net.uglobal.swiftvalidator.xml.beans.MT205COV.class), //
    MT207("207", net.uglobal.swiftvalidator.xml.beans.MT207.class), //
    MT210("210", net.uglobal.swiftvalidator.xml.beans.MT210.class), //
    MT256("256", net.uglobal.swiftvalidator.xml.beans.MT256.class), //
    MT300("300", net.uglobal.swiftvalidator.xml.beans.MT300.class), //
    MT303("303", net.uglobal.swiftvalidator.xml.beans.MT303.class), //
    MT307("307", net.uglobal.swiftvalidator.xml.beans.MT307.class), //
    MT321("321", net.uglobal.swiftvalidator.xml.beans.MT321.class), //
    MT380("380", net.uglobal.swiftvalidator.xml.beans.MT380.class), //
    MT381("381", net.uglobal.swiftvalidator.xml.beans.MT381.class), //
    MT500("500", net.uglobal.swiftvalidator.xml.beans.MT500.class), //
    MT501("501", net.uglobal.swiftvalidator.xml.beans.MT501.class), //
    MT502("502", net.uglobal.swiftvalidator.xml.beans.MT502.class), //
    MT503("503", net.uglobal.swiftvalidator.xml.beans.MT503.class), //
    MT504("504", net.uglobal.swiftvalidator.xml.beans.MT504.class), //
    MT505("505", net.uglobal.swiftvalidator.xml.beans.MT505.class), //
    MT506("506", net.uglobal.swiftvalidator.xml.beans.MT506.class), //
    MT507("507", net.uglobal.swiftvalidator.xml.beans.MT507.class), //
    MT508("508", net.uglobal.swiftvalidator.xml.beans.MT508.class), //
    MT509("509", net.uglobal.swiftvalidator.xml.beans.MT509.class), //
    MT510("510", net.uglobal.swiftvalidator.xml.beans.MT510.class), //
    MT513("513", net.uglobal.swiftvalidator.xml.beans.MT513.class), //
    MT514("514", net.uglobal.swiftvalidator.xml.beans.MT514.class), //
    MT515("515", net.uglobal.swiftvalidator.xml.beans.MT515.class), //
    MT516("516", net.uglobal.swiftvalidator.xml.beans.MT516.class), //
    MT517("517", net.uglobal.swiftvalidator.xml.beans.MT517.class), //
    MT518("518", net.uglobal.swiftvalidator.xml.beans.MT518.class), //
    MT519("519", net.uglobal.swiftvalidator.xml.beans.MT519.class), //
    MT524("524", net.uglobal.swiftvalidator.xml.beans.MT524.class), //
    MT526("526", net.uglobal.swiftvalidator.xml.beans.MT526.class), //
    MT527("527", net.uglobal.swiftvalidator.xml.beans.MT527.class), //
    MT530("530", net.uglobal.swiftvalidator.xml.beans.MT530.class), //
    MT535("535", net.uglobal.swiftvalidator.xml.beans.MT535.class), //
    MT536("536", net.uglobal.swiftvalidator.xml.beans.MT536.class), //
    MT537("537", net.uglobal.swiftvalidator.xml.beans.MT537.class), //
    MT538("538", net.uglobal.swiftvalidator.xml.beans.MT538.class), //
    MT540("540", net.uglobal.swiftvalidator.xml.beans.MT540.class), //
    MT541("541", net.uglobal.swiftvalidator.xml.beans.MT541.class), //
    MT542("542", net.uglobal.swiftvalidator.xml.beans.MT542.class), //
    MT543("543", net.uglobal.swiftvalidator.xml.beans.MT543.class), //
    MT544("544", net.uglobal.swiftvalidator.xml.beans.MT544.class), //
    MT545("545", net.uglobal.swiftvalidator.xml.beans.MT545.class), //
    MT546("546", net.uglobal.swiftvalidator.xml.beans.MT546.class), //
    MT547("547", net.uglobal.swiftvalidator.xml.beans.MT547.class), //
    MT548("548", net.uglobal.swiftvalidator.xml.beans.MT548.class), //
    MT549("549", net.uglobal.swiftvalidator.xml.beans.MT549.class), //
    MT558("558", net.uglobal.swiftvalidator.xml.beans.MT558.class), //
    MT559("559", net.uglobal.swiftvalidator.xml.beans.MT559.class), //
    MT564("564", net.uglobal.swiftvalidator.xml.beans.MT564.class), //
    MT565("565", net.uglobal.swiftvalidator.xml.beans.MT565.class), //
    MT566("566", net.uglobal.swiftvalidator.xml.beans.MT566.class), //
    MT567("567", net.uglobal.swiftvalidator.xml.beans.MT567.class), //
    MT568("568", net.uglobal.swiftvalidator.xml.beans.MT568.class), //
    MT569("569", net.uglobal.swiftvalidator.xml.beans.MT569.class), //
    MT575("575", net.uglobal.swiftvalidator.xml.beans.MT575.class), //
    MT576("576", net.uglobal.swiftvalidator.xml.beans.MT576.class), //
    MT577("577", net.uglobal.swiftvalidator.xml.beans.MT577.class), //
    MT578("578", net.uglobal.swiftvalidator.xml.beans.MT578.class), //
    MT579("579", net.uglobal.swiftvalidator.xml.beans.MT579.class), //
    MT581("581", net.uglobal.swiftvalidator.xml.beans.MT581.class), //
    MT586("586", net.uglobal.swiftvalidator.xml.beans.MT586.class), //
    ;
    //

	// %%%%%END%%%%%
	//
	//

	// TODO: add all MT types
	private String text;
	private Class<? extends MTMessage> mtMessageClass;

	private static final Map<String, MTType> textMapping = new HashMap<String, MTType>();
	private static final Map<Class<? extends MTMessage>, MTType> mtMessageMapping = new HashMap<Class<? extends MTMessage>, MTType>();

	static {
		for (MTType type : MTType.values()) {
			textMapping.put(type.getText(), type);
			mtMessageMapping.put(type.getMTMessageClass(), type);
		}
	}

	private MTType(String text, Class<? extends MTMessage> mtMessageClass) {
		this.text = text;
		this.mtMessageClass = mtMessageClass;
	}

	public String getText() {
		return this.text;
	}

	public Class<? extends MTMessage> getMTMessageClass() {
		return this.mtMessageClass;
	}

	public static MTType fromText(final String text) {
		return textMapping.get(text);
	}

	public static MTType fromMTMessage(final Class<? extends MTMessage> clazz) {
		return mtMessageMapping.get(clazz);
	}
}
