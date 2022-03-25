# Colored-Toast
This view is a custom toast is included success, fail, warning , info and changeable toast arguments .
 
 
 
 
 @Override
 
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        ColoredToast coloredToast= new ColoredToast(MainActivity.this);
        

        findViewById(R.id.button).setOnClickListener(v->
                coloredToast.success("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button2).setOnClickListener(v->
                coloredToast.fail("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button3).setOnClickListener(v->
                coloredToast.warning("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button4).setOnClickListener(v->
                coloredToast.info("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button5).setOnClickListener(v->
                coloredToast.customs("Welcome to Colored Toast", Toast.LENGTH_SHORT,
                R.color.white, //Must be from Resource - Ignore 0
                android.R.drawable.editbox_dropdown_dark_frame,//Must be from Resource - Ignore 0
                Color.argb(205, 182, 104, 0),//Must be argb - Ignore 0
                android.R.drawable.btn_star_big_on,//Must be from Resource - Ignore 0
                        Gravity.BOTTOM // Ignore 0
                ).show());
    }
<img src="(https://user-images.githubusercontent.com/53067774/160169777-3021113f-06d0-47a4-b61e-030ee267834c.jpg)" width="128"/>
![Screenshot_2022-03-25-20-14-05-984_com src tools](https://user-images.githubusercontent.com/53067774/160169787-7e5932e3-e655-47dc-9acd-d3b5e3bde725.jpg)
![Screenshot_2022-03-25-20-14-11-506_com src tools](https://user-images.githubusercontent.com/53067774/160169799-e814be6c-80ad-4f5e-8fab-785e81531964.jpg)
![Screenshot_2022-03-25-20-14-14-971_com src tools](https://user-images.githubusercontent.com/53067774/160169811-cb655179-8135-426a-b591-53917d9d1f4c.jpg)
![Screenshot_2022-03-25-20-14-20-220_com src tools](https://user-images.githubusercontent.com/53067774/160169821-1fb3b5b5-b598-4f53-b95c-9dd97a08f27e.jpg)
![Screenshot_2022-03-25-20-14-26-004_com src tools](https://user-images.githubusercontent.com/53067774/160169826-f005d538-e092-4a58-ab75-8ef5d32b08ae.jpg)

