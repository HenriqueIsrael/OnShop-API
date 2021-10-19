package com.example.OnShopAPI.service

import com.example.OnShopAPI.model.Product
import org.springframework.stereotype.Service

@Service
class ProductsService {
    fun getProducts(): List<Product> {
        val list = listOf(
            Product(
                1,
                "https://www.cavaletti.com.br/wp-content/uploads/2020/12/Velo-caract.png",
                "Cavaletti Vélo", "Perfeita para o home office", 1839.00, 1
            ),
            Product(
                2,
                "https://assets.betalabs.net/production/flexform/item-images/902200bd8625b4dc5b82902122608cb1.png",
                "Flexform My Chair Light", "Bem-estar ao usuário", 945.00, 1
            ),
            Product(
                3,
                "https://ds92okzpvwldu.cloudfront.net/Custom/Content/Products/98/60/986005_cadeira-dxracer-formula-f186iwr-36_z2_637028772279275540.png",
                "DxRacer F186-IWR", "Máximo conforto para sua gameplay", 2199.00, 1
            ),
            Product(
                4,
                "https://ds92okzpvwldu.cloudfront.net/Custom/Content/Products/98/59/985980_cadeira-dxracer-rc-series-blackred-rw01rn-11_z1_637078957823803516.png",
                "DxRacer RW01-RN", "Rodas silenciosas e de alta durabilidade", 1799.00, 1
            ),
            Product(
                5,
                "https://ds92okzpvwldu.cloudfront.net/Custom/Content/Products/24/26/2426222_cadeira-dxracer-cat-ja002-pw-340_z1_637312071848584527.png",
                "DxRacer Cat", "Desing exclusivo e elegante", 2499.00, 1
            ),
            Product(
                6,
                "https://images-americanas.b2w.io/produtos/01/00/img1/134572/8/134572899_5SZ.jpg",
                "AkRacing Premium v2", "Mais estilo, mais fps", 2499.00, 1
            ),
            Product(
                7,
                "https://www.atec.com.br/loja/wp-content/uploads/2020/09/aeron-graphite-AER2B21HWALPG1G1G1BBBK23103-1-1.jpg",
                "Herman Miller Aeron", "Ergonomia incomparável", 8750.00, 1
            ),
            Product(
                8,
                "https://www.atec.com.br/loja/wp-content/uploads/2021/05/PIA1YB423HAAJBKDCRBB1HA04.png",
                "Herman Miller Verus", "Alinhamento e apoio ergonômico", 4380.00, 1
            ),
            Product(
                9,
                "https://a-static.mlcdn.com.br/618x463/notebook-gamer-acer-nitro-5-an515-54-58cl-intel-core-i5-8gb-1tb-128gb-ssd-156-nvidia-gtx-1650/magazineluiza/226192400/b5eb243c94fb20b5a5aa37ab02aabe75.jpg",
                "Acer nitro 5", "Core i5,8 GB,128GB SSD,15,6' e GTX1650", 4589.10, 2
            ),
            Product(
                10,
                "https://a-static.mlcdn.com.br/618x463/notebook-2-em-1-dell-inspiron-5406-m30s-14-full-hd-touch-11a-geracao-intel-core-i7-8gb-256gb-ssd-windows-10-mcafee/dell/i5406w6007w/24dde76335c14eff4f5d2056101cc4f9.jpg",
                "Dell Inspiron 5406", "Core i7,8GB,256 GB SSD,14 e Iris Xe Graphics", 6029.10, 2
            ),
            Product(
                11,
                "https://a-static.mlcdn.com.br/618x463/notebook-acer-aspire-5-a515-54-57en-intel-core-i5-8gb-256gb-ssd-156-full-hd-led-windows-10/magazineluiza/230310100/10188c0b18f8d6722b57397709169ae0.jpg",
                "Acer Aspire 5", "Core i5,8GB,256 GB,15.6' e UHD Graphics G1", 3419.10, 2
            ),
            Product(
                12,
                "https://a-static.mlcdn.com.br/618x463/notebook-lenovo-ideapad-s145-81v70008br-amd-ryzen-5-3500u-8gb-256gb-ssd-156-windows-10/magazineluiza/225444200/160c68610236d03033aef7a0a1788b27.jpg",
                "Lenovo Ideapad S145", "Ryzen 5,8GB,256GB SSD,15.6' e RX Vega 8", 2969.10, 2
            ),
            Product(
                13,
                "https://i.dell.com/is/image/DellContent//content/dam/global-asset-library/Products/Notebooks/g-series/g3_15_3500_non-touch/dg3500nt_cnb_00055lf110_bk_baseline.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=402&qlt=85,0&resMode=sharp2&op_usm=1.75,0.3,2,0&size=402,402",
                "Dell G3 15", "i7, 16GB, 512GB SSD,15.6' e GTX 1650", 5499.00, 2
            ),
            Product(
                14,
                "https://i.dell.com/is/image/DellContent//content/dam/global-site-design/product_images/dell_client_products/notebooks/xps_notebooks/xps_13_9310/general/xps-13_black_open-up-left-v2.jpg?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=664&qlt=85,0&resMode=sharp2&op_usm=1.75,0.3,2,0&size=664,402",
                "Dell XPS 13", "i7,16GB,1TB SSD,13.4' e Iris Xe Graphics", 11299.00, 2
            ),
            Product(
                15,
                "https://m.media-amazon.com/images/I/31WWqmW1WaL._AC_SY355_.jpg",
                "Macbook Air",
                "Chip M1,8GB,256 SSD e 13' ",
                7728.00,
                2
            ),
            Product(
                16,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1696845971",
                "Lenovo Ideapad L340",
                "i5,8GB,256GB SSD,15.6' e GTX 1050",
                4999.00,
                2
            ),
            Product(
                17,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1476192805",
                "Iphone 12",
                "128GB,tela de 6.1',Câmera dupla 12MP",
                6578.14,
                3
            ),
            Product(
                18,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1476192653",
                "Iphone 12",
                "64GB,tela de 6.1',Câmera dupla 12MP", 5723.89, 3
            ),
            Product(
                19,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1796211008",
                "Sansung Galaxy S20",
                "128GB,6GB RAM,Tela 6.5' e Octa-Core", 2249.00, 3
            ),
            Product(
                20,
                "https://brmotorolanew.vtexassets.com/arquivos/ids/158705-800-auto?width=800&height=auto&aspect=true",
                "Moto G 5G ", "128GB,6GB RAM,Tela 6.7',Câmera 49 MP", 1699.15, 3
            ),
            Product(
                21,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1469199743",
                "iPhone SE",
                "64 GB,Tela de 4.7',Câmera de 12 MP",
                2668.00,
                3
            ),
            Product(
                22,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1414569839",
                "Moto G9 Play",
                "64 GB,4 GB RAM,Tela de 6.5' e Octa-Core",
                1042.46,
                3
            ),
            Product(
                23,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1527100306",
                "Redmi Note 8",
                "64 GB,4 GB RAM,tela de 6.3' e Snapdragon 665",
                1259.90,
                3
            ),
            Product(
                24,
                "https://http2.mlstatic.com/D_NQ_NP_712229-MLA44508402139_012021-O.webp",
                "Huawei Y9 Prime",
                "64 GB,4 GB RAM,Tela de 6.59 e Câmera: 16 MP",
                1395.00,
                3
            ),
            Product(
                25,
                "https://snpi.dell.com/snp/images2/300/pt-br~AA739326/AA739326.jpg",
                "Astro a10",
                "Feito para prolongar o seu jogo",
                599.00,
                4

            ),
            Product(
                26,
                "https://images.kabum.com.br/produtos/fotos/69279/headset-gamer-hyperx-cloud-core-khx-hscc-bk-preto-vermelho_1585860259_gg.jpg",
                "HyperX Cloud Core",
                "Melhor experiência em conforto e design",
                499.90, 4
            ),
            Product(
                27,
                "https://http2.mlstatic.com/D_NQ_NP_896582-MLA44490109312_012021-O.webp",
                "Redragon Zeus 2",
                "Microfone e cabo destacável",
                383.00,
                4
            ),
            Product(
                28,
                "https://http2.mlstatic.com/D_NQ_NP_950921-MLA44490109314_012021-O.webp",
                "Redragon Zeus 2", "Edição limitada para as gamers", 391.00, 4
            ),
            Product(
                29,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1328686276",
                "Razer Kraken",
                "7.1 surround, verde e microfone retrátil",
                769.40,
                4
            ),
            Product(
                30,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=43448638",
                "HyperX Stinger Core",
                "Sem fio PS4, PS5 e PC",
                699.00,
                4
            ),
            Product(
                31,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1613078519",
                "Dazz Antares Scorpion",
                "USB 2.0,preto e microfone destacável",
                349.50,
                4
            ),
            Product(
                32,
                "https://images.kabum.com.br/produtos/fotos/181878/headset-gamer-logitech-g335-3-5mm-para-pc-playstation-xbox-switch-mobile-driver-40mm-arco-ajustavel-verde-981-001023_1627326460_gg.jpg",
                "Logitech G335", "Driver 40 mm e arco ajustável", 539.20, 4
            ),
            Product(
                33,
                "https://images.kabum.com.br/produtos/fotos/98696/mouse-gamer-hyperx-pulsefire-core-hx-mc004b_mouse-gamer-hyperx-pulsefire-core-hx-mc004b_1539172781_gg.jpg",
                "HyperX Pulsefire", "6200 DPI e RGB", 159.90, 5
            ),
            Product(
                34,
                "https://images.kabum.com.br/produtos/fotos/98244/mouse-gamer-logitech-g502-hero-16k-rgb-lightsync-11-botoes-16000-dpi-910-005550_1626297206_gg.jpg",
                "Logitech G502", "Ajuste de peso e 11 botões", 339.20, 5
            ),
            Product(
                35,
                "https://images.kabum.com.br/produtos/fotos/112947/mouse-gamer-logitech-g203-rgb-lightsync-6-botoes-8000-dpi-branco-910-005794_1591126854_gg.jpg",
                "Logitech G302", "RGB, Lightsync e 6 botões", 109.90, 5
            ),
            Product(
                36,
                "https://images.kabum.com.br/produtos/fotos/156352/mouse-gamer-sem-fio-razer-viper-ultimate-cyberpunk-2077-edition-razer-chroma-20000dpi-8-botoes-amarelo-preto-rz01-03050500-r3m1_1620131147_gg.jpg",
                "Razer Viper", "Cyberpunk 2077 Edition", 1533.99, 5
            ),
            Product(
                37,
                "https://images.kabum.com.br/produtos/fotos/117229/mouse-sem-fio-gamer-razer-viper-ultimate-chroma-8-botoes-20000dpi-rz01-03050200-r3u1_1597322472_gg.jpg",
                "Razer Viper Ultimate", "8 botões e 20000 DPI", 799.90, 5
            ),
            Product(
                38,
                "http://www.motospeed.cc/upfile/20191017114923_453.png",
                "Motospeed v90", "Backlight e 12000 DPI", 249.00, 5
            ),
            Product(
                39,
                "https://images.kabum.com.br/produtos/fotos/103353/mouse-gamer-corsair-m65-rgb-elite-8-botoes-18000dpi-branco-ch-9309111-na_mouse-gamer-corsair-m65-rgb-elite-8-botoes-18000dpi-branco-ch-9309111-na_1566397378_gg.jpg",
                "Corsair M65 Elite", "RGB, 8 botões e 18000 DPI", 432.20, 5
            ),
            Product(
                40,
                "https://www.casasbahia-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1600726456",
                "HP Spectre 700",
                "Bluetooth, Preto e 4500 DPI", 1123.26, 5
            )
        )
        return list
    }
}

