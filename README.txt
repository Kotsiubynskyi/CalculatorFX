CalculatorFX

	Description
This app is simple calculator written using with help of Java GUI platform - JavaFX.
Due to possibility to write GUI layout in xml files general readability of code is great.
In addition to this I used ScriptEngine (Since 1.6) to perform all arithmetical calculations.
Finally code is very short.

	Launching
You can run this app either using cmd(with some tricky way) or simply with your favourite IDE.
There is another way. You can also run this app by packaging it into exe. Here how you can do it.
	1) You need to have installed JDK 7u6 or higher.
	2) Find tool JDK\bin\javafxpackager.exe.
	3) stay in the same folder as 'src' and run command bellow:
		javafxpackager -makeall -appclass edu.ua.nau.calculator.Main -outdir . -name CalulatorFX -v
	4) That`s all. You can find executable file CalcualtorFX.exe in \dist\bundles\CalulatorFX\CalulatorFX.exe