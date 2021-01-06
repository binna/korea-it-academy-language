# folium 라이브러리를 사용하면 지도를 출력하고 지도 위에 Marker 를 표시할 수 있다.
import folium

# folium 라이브러리의 Map() 메소드로 location 속성으로 지정한 위치를 중심으로 하는 zoom_start 만큼의 배율을 사용하는 지도를 만든다.
star_map = folium.Map(location=[37.5662994, 126.9757511], zoom_start=16)

# folium 라이브러리의 Marker() 메소드로 location 속성으로 지정한 위치에 마커를 만든다.
# 작성한 마커를 add_to() 메소드를 사용해서 folium 지도에 추가한다.
# Marker() 메소드의 popup 속성으로 마커를 클릭했을 때 표시되는 팝업 문자열을 지정할 수 있다.
popup = folium.Popup('서울특별시청', max_width=600)
folium.Marker(location=[37.5662994, 126.9757511], popup=popup).add_to(star_map)

# save() 메소드로 folium 을 사용해서 작성한 지도를 HTML 파일로 저장할 수 있다.
# map.html 저장, 웹 브라우저로 해당 파일 실행하면 지도를 볼 수 있다.
star_map.save('map.html')
