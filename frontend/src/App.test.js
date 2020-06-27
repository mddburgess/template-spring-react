import React from 'react';
import {act, render} from '@testing-library/react';
import App from './App';

test('renders', async () => {
    fetch.mockResponse('Hello Test!');

    await act(async () => {
        await render(<App/>);
    });

    expect(document.body).toMatchSnapshot();
});
