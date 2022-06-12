const state = {
    //Nơi lưu trữ các trạng thái của ứng dụng
    products: [
        {
            id: 1,
            name: 'Mô hình xe cổ Volkswagen Beetle 1967',
            image: require('@/assets/mohinhxe/1.jpg'),
            variants:[
                {id:1000, color:'Trắng',image:'@/assets/mohinhxe/1.jpg'},
                {id:1001, color:'Đen',image:'@/assets/mohinhxe/1_2.jpg'}
            ],
            description: ' Mô hình xe có thiết kế như thật với những đường nét mô phỏng chi tiết.',
            price: 250,
        },
        {
            id: 2,
            name: 'Mô hình xe ô tô Lexus LX570 Sport 2020',
            image: require('@/assets/mohinhxe/2.jpg'),
            variants:[
                {id:2000, color:'Đen',image:'@/assets/mohinhxe/2.jpg'},
                {id:2001, color:'Trắng',image:'@/assets/mohinhxe/2_2.jpg'}
            ],
            description: 'MÔ HÌNH XE Ô TÔ TRƯNG BÀY với kích cỡ nhỏ nhắn sẽ trở thành một món sưu tập thú vị trong phòng của bạn.',
            price: 210,
        },
        {
            id: 3,
            name: 'Mô hình Ford Beast Raptor',
            image: require('@/assets/mohinhxe/3.jpg'),
            variants:[
                {id:3000, color:'Đen',image:'@/assets/mohinhxe/3.jpg'},
                {id:3001, color:'Đỏ',image:'@/assets/mohinhxe/3_2.jpg'}
            ],
            description: 'MÔ HÌNH XE Ô TÔ TRƯNG BÀY với kích cỡ nhỏ nhắn sẽ trở thành một món sưu tập thú vị trong phòng của bạn.',
            price: 290,
        },
        {
            id: 4,
            name: 'Mô hình mô tô Honda CBR 1000RR',
            image: require('@/assets/mohinhxe/4.jpg'),
            variants:[
                {id:4000, color:'Đen',image:'@/assets/mohinhxe/4.jpg'},
                {id:4001, color:'Đen',image:'@/assets/mohinhxe/4.jpg'}
            ],
            description: 'Mô hình xe được làm bằng khung đúc bằng kim loại , lốp xe được làm bằng cao su tự nhiên, các chi tiết ống xả và lưới tản nhiệt được xi bóng .',
            price: 320,
        },
        {
            id: 5,
            name: 'Mô hình xe Mercedes Benz S-Class S600',
            image: require('@/assets/mohinhxe/5.jpg'),
            variants:[
                {id:5000, color:'Trắng',image:'@/assets/mohinhxe/5.jpg'},
                {id:5001, color:'Trắng',image:'@/assets/mohinhxe/5.jpg'}
            ],
            description: 'Mô hình xe được làm bằng khung đúc bằng kim loại',
            price: 230,
        },
        {
            id: 6,
            name: 'Mô hình mô tô Motorcycle Road King 2017',
            image: require('@/assets/mohinhxe/6.jpg'),
            variants:[
                {id:6000, color:'Đen',image:'@/assets/mohinhxe/6.jpg'},
                {id:6001, color:'Đen',image:'@/assets/mohinhxe/6.jpg'}
            ],
            description: 'Mô hình xe được làm bằng khung đúc bằng kim loại, các chi tiết ống xả và lưới tản nhiệt được xi bóng .',
            price: 140,
        },
    ],
    informations :{
            image: require('@/assets/avatar.jpg'),
            Name: 'Lê Trần Anh Tính',
            Class:'CD20CT11',
            School:' Cao Đẳng Công Nghệ Thông Tin TP.HCM',
            Tel:'0328691781',
            Email:'anhtinh0902@gmail.com',
            Adress:'Bình Định'
        },
    cart: [],
    searchValue: '',
}

export default state
