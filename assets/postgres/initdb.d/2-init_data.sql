CREATE TABLE public.banners (
    id int8 NOT NULL,
    image_url varchar(255) NULL,
    "name" varchar(255) NULL,
    target varchar(255) NULL,
    CONSTRAINT banners_pkey PRIMARY KEY (id)
);

CREATE TABLE public.pages (
    id int4 NOT NULL,
    "text" varchar(255) NULL,
    title varchar(255) NULL,
    CONSTRAINT pages_pkey PRIMARY KEY (id)
);

CREATE TABLE public.shop (
     id int8 NOT NULL,
     currency varchar(255) NULL,
     description varchar(255) NULL,
     flag_icon varchar(255) NULL,
     google_ua varchar(255) NULL,
     "language" varchar(255) NULL,
     logo varchar(255) NULL,
     "name" varchar(255) NULL,
     url varchar(255) NULL,
     CONSTRAINT shop_pkey PRIMARY KEY (id)
);

INSERT INTO public.banners (id, name, target, image_url) VALUES(1, 'Big sale', 'detail:5', 'https://i.pinimg.com/originals/b0/27/52/b02752520d4a39b1913556e7e4292883.jpg'),
                                                        (2, 'Big sale', 'list:2', 'http://1.bp.blogspot.com/-ekOGJMWwey0/VYOg76pSGKI/AAAAAAAABUI/9lSyIonBDvo/s640/Fashion%2BMia%2BCoupon%2BCodes%2BBanner.jpg');

INSERT INTO public.pages (id, title, "text") values (1, 'FAQ', 'some text'), (2, 'About Us', 'About Us');

INSERT INTO public.shop (id, currency, description, flag_icon, google_ua, "language", logo, "name", url)
           VALUES(1, 'INR', 'eFery: Your need our need', '', '', 'EN-US', '', 'eFery', 'http://efery.com');
