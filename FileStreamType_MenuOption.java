package PENG.library.enummenu;

	public enum FileStreamType_MenuOption
	{
	   // declare contents of enum type
	   CHARACTER_BASED 		( 0, "CHARACTER_BASED"),
	   BYTE_BASED	        ( 1, "BYTE_BASED" ),
	   STANDARD_BASED     	( 2, "TEXT_BASED"),
	   EXIT                 ( 3, "EXIT");
	 
	  

	   private final int value; // current menu option
	   private final String  optionType; // current menu option
	   
	   private FileStreamType_MenuOption( int valueOption, String optionT )
	   {
	      value = valueOption;
	      optionType= optionT;
	   } // end MenuOptions enum constructor

	   public int getValue()
	   {
	      return value;
	   } // end method getValue
	   
	   public String getOptionType()
	   {
	      return optionType;
	   } // end method getNumberType
	} // end enum NumberType_MenuOption
