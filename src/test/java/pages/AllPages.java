package pages;

import pages.android.*;

public class AllPages {

    //parametresiz contsructor  olusturuyoruz
    public AllPages(){

    }

    //javada her class return type olabilir
    //Her page class return type ile private instance olusturduk
    private APIDemosPage apiDemosPage;
    private MainPage mainPage;
    private PreferencePage preferencePage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private SwitchPage switchPage;
    private ViewPage viewPage;
    private DragDropPage dragDropPage;
    private DateWidgetsPage dateWidgetsPage;
    private ExpandableListsPage expandableListsPage;
    private SpinnerPage spinnerPage;


    //her page class icin public method olusturup obje olusturacagiz

    public APIDemosPage apiDemosPage(){
        if (apiDemosPage==null){ //eger benim burda olusturdugum instance apiDemosPage yani null ise
            apiDemosPage=new APIDemosPage(); //o zaman bunu bana bir obje olarak olustur daha sonra bu objeyi bana ver
        }
        return apiDemosPage; //ben bu methodu cagirdigim zaman onu kullanayim
    }

    public MainPage mainPage(){
        if (mainPage==null){
            mainPage=new MainPage();
        }
        return mainPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage==null){
            preferencePage=new PreferencePage();
        }
        return preferencePage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage==null){
            preferenceDependenciesPage=new PreferenceDependenciesPage();
        }
        return  preferenceDependenciesPage;
    }

    public SwitchPage switchPage(){
        if (switchPage==null){
            switchPage=new SwitchPage();
        }
        return switchPage;
    }

    public ViewPage viewPage(){
        if (viewPage==null){
            viewPage=new ViewPage();
        }
        return viewPage;
    }

    public DragDropPage dragDropPage(){
        if (dragDropPage==null){
            dragDropPage=new DragDropPage();
        }
        return dragDropPage;
    }

    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage==null){
            dateWidgetsPage=new DateWidgetsPage();
        }
        return dateWidgetsPage;
    }

    public ExpandableListsPage expandableListsPage(){
        if (expandableListsPage==null){
            expandableListsPage=new ExpandableListsPage();
        }
        return expandableListsPage;
    }

    public SpinnerPage spinnerPage(){
        if (spinnerPage==null){
            spinnerPage=new SpinnerPage();
        }
        return spinnerPage;
    }

}
