# Trình download album nhạc chất lượng cao từ zing mp3

>Sử dụng bật trình duyệt bằng cách sử dụng ```selenium``` để thao tác với trình duyệt như google chrome. Và sử dụng trình get LINK từ https://zing-mp3.glitch.me/? bằng termial với URL https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/id_baihat để tải về băng HTTP request.

## Bật trình duyệt truy vấn album

<img src='https://github.com/vuquangtin/GetLinkVIPZingMP3/img/zing_album.png'/>

view source HTML bạn sẽ thấy chuỗi js trả về danh sách album với

- tên
- url trong đó có id để sử dung trong https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/id_baihat
- ...


```html
<script type="application/ld+json">
    {
    "@context": "http://schema.org",
    "@type": "MusicPlaylist",
    "name": "Nhạc Đỏ Hay Nhất - Various Artists - Zing MP3",
    "url": "https://zingmp3.vn/album/Nhac-Do-Hay-Nhat-Various-Artists/ZOD9AA9W.html",
    "image": "https://zmp3-photo-fbcrawler.zadn.vn/cover_video/0/e/3/8/0e38face90b5f266d73d230320d2ff42.jpg",
    "description": "Nhạc Đỏ Hay Nhất - Various Artists - Zing MP3",
    "thumbnailUrl": "https://zmp3-photo-fbcrawler.zadn.vn/cover_video/0/e/3/8/0e38face90b5f266d73d230320d2ff42.jpg",
    "numTracks": "24",
    
    "genre":"Việt Nam,Nhạc Cách Mạng",
    
    
    "track": {
        "@type": "ItemList",
        "numberOfItems": 24,
        "itemListElement": [
            
            {
                "@type": "ListItem",
                "position": 1,
                "url": "https://zingmp3.vn/bai-hat/Bai-Ca-Khong-Quen-Cam-Van/ZWZB988C.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Bài Ca Không Quên",
                    "duration": "PT6M38S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Cẩm Vân",
                        "url": "https://zingmp3.vn/nghe-si/Cam-Van"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bài Ca Người Lính"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 2,
                "url": "https://zingmp3.vn/bai-hat/Co-Gai-Mo-Duong-Top-Nu-Quan-Khu-Bay/ZW78O0CB.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Cô Gái Mở Đường",
                    "duration": "PT5M50S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Tốp Nữ Quân Khu Bảy",
                        "url": "https://zingmp3.vn/nghe-si/Top-Nu-Quan-Khu-Bay"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bài Ca Trường Sơn"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 3,
                "url": "https://zingmp3.vn/bai-hat/Tieu-Doan-307-Cao-Minh/ZWZB986I.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Tiểu Đoàn 307",
                    "duration": "PT3M57S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Cao Minh",
                        "url": "https://zingmp3.vn/nghe-si/Cao-Minh"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Tiểu Đoàn 307"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 4,
                "url": "https://zingmp3.vn/bai-hat/Tien-Ve-Sai-Gon-Top-Ca-Nam/ZW6UDCFD.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Tiến Về Sài Gòn",
                    "duration": "PT3M47S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Tốp Ca Nam",
                        "url": "https://zingmp3.vn/nghe-si/Top-Ca-Nam"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Cô Gái Mở Đường "
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 5,
                "url": "https://zingmp3.vn/bai-hat/Qua-Song-Cam-Ly/ZWZCW6BF.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Qua Sông",
                    "duration": "PT3M26S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Cẩm Ly",
                        "url": "https://zingmp3.vn/nghe-si/Cam-Ly"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Cô Gái Mở Đường"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 6,
                "url": "https://zingmp3.vn/bai-hat/Dem-Thanh-Pho-Day-Sao-Quang-Dung/ZWZ978CD.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Đêm Thành Phố Đầy Sao",
                    "duration": "PT4M55S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Quang Dũng",
                        "url": "https://zingmp3.vn/nghe-si/Quang-Dung"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Đêm Thành Phố Đầy Sao"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 7,
                "url": "https://zingmp3.vn/bai-hat/O-Hai-Dau-Noi-Nho-Thanh-Thuy/ZWZE6UAA.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Ở Hai Đầu Nỗi Nhớ",
                    "duration": "PT4M38S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Thanh Thúy",
                        "url": "https://zingmp3.vn/nghe-si/Thanh-Thuy"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bản Tình Ca Huyền Thoại"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 8,
                "url": "https://zingmp3.vn/bai-hat/Bai-Ca-Nguoi-Linh-Cao-Minh-Hoai-Nam/ZWZB988D.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Bài Ca Người Lính",
                    "duration": "PT4M3S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Cao Minh",
                        "url": "https://zingmp3.vn/nghe-si/Cao-Minh"
                        },
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Hoài Nam",
                        "url": "https://zingmp3.vn/nghe-si/Hoai-Nam"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bài Ca Người Lính"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 9,
                "url": "https://zingmp3.vn/bai-hat/Co-Gai-Sai-Gon-Di-Tai-Dan-Trang-Nhung/ZW6ZF8BW.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Cô Gái Sài Gòn Đi Tải Đạn",
                    "duration": "PT3M48S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Trang Nhung",
                        "url": "https://zingmp3.vn/nghe-si/Trang-Nhung"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Nổi Lửa Lên Em"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 10,
                "url": "https://zingmp3.vn/bai-hat/Vam-Co-Dong-Quang-Linh/ZWZB987Z.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Vàm Cỏ Đông",
                    "duration": "PT5M3S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Quang Linh",
                        "url": "https://zingmp3.vn/nghe-si/Quang-Linh"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Tiểu Đoàn 307"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 11,
                "url": "https://zingmp3.vn/bai-hat/La-Xanh-Tam-Ca-Ao-Trang/ZWZCEO8O.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Lá Xanh",
                    "duration": "PT3M43S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Tam Ca Áo Trắng",
                        "url": "https://zingmp3.vn/nghe-si/Tam-Ca-Ao-Trang"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Tiếng Gọi Thanh Niên"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 12,
                "url": "https://zingmp3.vn/bai-hat/Khuc-Hat-Nguoi-Di-Khai-Hoang-Quoc-Dai/ZWZCW6BC.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Khúc Hát Người Đi Khai Hoang",
                    "duration": "PT5M42S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Quốc Đại",
                        "url": "https://zingmp3.vn/nghe-si/Quoc-Dai"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Cô Gái Mở Đường"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 13,
                "url": "https://zingmp3.vn/bai-hat/Hat-Ve-Anh-FM/ZW70EU8E.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Hát Về Anh",
                    "duration": "PT4M38S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "FM",
                        "url": "https://zingmp3.vn/nghe-si/FM"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Biển Đông Đầu Sóng Ngọn Gió"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 14,
                "url": "https://zingmp3.vn/bai-hat/Hay-Yen-Long-Me-Oi-Dan-Truong/ZWZB987I.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Hãy Yên Lòng Mẹ Ơi",
                    "duration": "PT4M57S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Đan Trường",
                        "url": "https://zingmp3.vn/nghe-si/Dan-Truong"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Tiểu Đoàn 307"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 15,
                "url": "https://zingmp3.vn/bai-hat/Gan-Lam-Truong-Sa-Thanh-Thuy/ZWZE6UBW.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Gần Lắm Trường Sa",
                    "duration": "PT5M7S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Thanh Thúy",
                        "url": "https://zingmp3.vn/nghe-si/Thanh-Thuy"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bản Tình Ca Huyền Thoại"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 16,
                "url": "https://zingmp3.vn/bai-hat/Tu-Nguyen-Duc-Tuan-Noo-Phuoc-Thinh/ZW70EI0W.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Tự Nguyện",
                    "duration": "PT4M12S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Đức Tuấn",
                        "url": "https://zingmp3.vn/nghe-si/Duc-Tuan"
                        },
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Noo Phước Thịnh",
                        "url": "https://zingmp3.vn/nghe-si/Noo-Phuoc-Thinh"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Bài Ca Không Quên"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 17,
                "url": "https://zingmp3.vn/bai-hat/Noi-Lua-Len-Em-Anh-Tho/ZWZA8C7W.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Nổi Lửa Lên Em",
                    "duration": "PT4M35S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Anh Thơ",
                        "url": "https://zingmp3.vn/nghe-si/Anh-Tho"
                        }
                        
                    ]
                    
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 18,
                "url": "https://zingmp3.vn/bai-hat/La-Do-Dan-Truong/ZWZCDAUU.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Lá Đỏ",
                    "duration": "PT4M57S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Đan Trường",
                        "url": "https://zingmp3.vn/nghe-si/Dan-Truong"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Anh Ở Đầu Sông Em Cuối Sông"
                    
                }
            },
            
            {
                "@type": "ListItem",
                "position": 19,
                "url": "https://zingmp3.vn/bai-hat/Hanh-Khuc-Ngay-Va-Dem-Trong-Tan/ZWZAA7E0.html",
                "item": {
                    "@type": "MusicRecording",
                    "name": "Hành Khúc Ngày Và Đêm",
                    "duration": "PT4M31S",
                          
                    "byArtist": [                    
                        
                        {
                        "@type": "MusicGroup",
                        "name": "Trọng Tấn",
                        "url": "https://zingmp3.vn/nghe-si/Trong-Tan"
                        }
                        
                    ]
                    
                    
                    ,"inAlbum":"Rặng Trâm Bầu"
                    
                }
            }
            
        ]
    }
  }
</script>
```


Sau khi có được danh sách các id của bài hát như:

- ZWZAA7E0
- ZWZA8C7W
- ZW70EI0W


ta sẽ sử dụng HTTP Request đến các bài hát và sẽ có được thông tin JSON của bài hát

- https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/ZWZAA7E0
- https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/ZWZA8C7W
- https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/ZW70EI0W

thông tin JSON của bài hát như ví dụ sau:

```json
{
   "song_id_encode":"ZWZAA7E0",
   "title":"Hành Khúc Ngày Và Đêm",
   "artist_id":"418",
   "artist":"Trọng Tấn",
   "genre_id":"1,11",
   "duration":0,
   "download_status":1,
   "copyright":10089,
   "status_id":1,
   "co_id":8,
   "ad_status":1,
   "license_status":2,
   "link":"https://mp3.zing.vn//bai-hat/Hanh-Khuc-Ngay-Va-Dem-Trong-Tan/ZWZAA7E0.html",
   "preroll":"",
   "total_play":0,
   "likes":0,
   "favourites":0,
   "favourite_this":false,
   "comments":0,
   "genre_name":"Việt Nam, Nhạc Trữ Tình",
   "type":"audio",
   "source":{
      "audio":{
         "128":{
            "view":"http://mp3-s1-zmp3.zadn.vn/6344a4530317ea49b306/1923064115038693977?authen=exp=1600418852~acl=/6344a4530317ea49b306/*~hmac=de6d26664de8ec734dea8185074fe4ff",
            "download":"http://mp3-s1-zmp3.zadn.vn/6344a4530317ea49b306/1923064115038693977?authen=exp=1600418852~acl=/6344a4530317ea49b306/*~hmac=de6d26664de8ec734dea8185074fe4ff&filename=ZWZAA7E0_128.mp3"
         },
         "320":{
            "view":"http://mp3-s1-zmp3.zadn.vn/6344a4530317ea49b306/1923064115038693977?authen=exp=1600418852~acl=/6344a4530317ea49b306/*~hmac=de6d26664de8ec734dea8185074fe4ff",
            "download":"http://mp3-s1-zmp3.zadn.vn/6344a4530317ea49b306/1923064115038693977?authen=exp=1600418852~acl=/6344a4530317ea49b306/*~hmac=de6d26664de8ec734dea8185074fe4ff&filename=ZWZAA7E0_320.mp3"
         }
      }
   }
}
```

vậy là ta đã có URL của file mp3 theo nhiều định dạng tuỳ chọn như ```320``` , ```128``` với mẫu thời gian tồn tại nên ta chỉ có thể download trong 1 thời điểm khi truy vấn xong.
