package PENG.polymorphism.employee.menuoption;
import java.awt.Color;
public enum EarningLevelEnum{
	LevelA ( 15, "Level A", "A", new Color(255,0,0)),
	LevelB (  8, "Level B", "B", new Color(0,255,0)),
	LevelC (  0, "Level C", "C", new Color(0,0,25)),
	UNIT   (1000,"Thousand", "", new Color(255,255,255)),
	Max_WORKET_HOURS(80, " max worked hours", "", new Color(255,255,255));
	
	
	private final int value;
	private final String levelOrUnitType;
	private final String levelCharacter;
	private final Color indexColor;
	
	private EarningLevelEnum( int _valueOption, String _levelOrUnitType, String _levelCharavter, Color _indexColor)
	{
		value = _valueOption;
		levelOrUnitType = _levelOrUnitType;
		levelCharacter = _levelCharavter;
		indexColor = _indexColor;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getLevelType()
	{
		return levelOrUnitType;
	}
	
	public String getLevelCharacter()
	{
		return levelCharacter;
	}
	
	public Color getColor()
	{
		return indexColor;
	}
	
}