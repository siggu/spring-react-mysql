import React, { useState } from "react";
import "./App.css";
import BoardItem from "components/BoardItem";
import latestBoardListMock from "mocks/latest-board-list.mock";
import Top3Item from "components/Top3Item";
import top3BoardListMock from "mocks/top-3-board-list.mock";
import CommentItem from "components/CommentItem";
import commentListMock from "mocks/comment-list.mock";
import favoriteListMock from "mocks/favorite-list.mock";
import FavoriteItem from "components/FavoriteItem";
import InputBox from "components/InputBox";

function App() {
  const [value, setValue] = useState<string>("");
  return (
    <>
      <InputBox
        label="이메일"
        type="text"
        placeholder="이메일 주소를 입력해주세요"
        value={value}
        error={false}
        setValue={setValue}
        message="asdf"
      />
    </>
  );
}

export default App;
